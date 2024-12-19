package com.example.Webscraper.controller;

import com.example.Webscraper.model.BrightDataResponse;
import com.example.Webscraper.service.ScraperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

@RestController
public class ScraperController {

    private final ScraperService scraperService;

    public ScraperController(ScraperService scraperService) {
        this.scraperService = scraperService;
    }

    @GetMapping("/scrape")
    public BrightDataResponse scrape(
            @RequestParam String website,
            @RequestParam String url
    ) {
        // List of supported websites for validation
        Map<String, String> supportedWebsites = Map.of(
                "amazon", "https://www.amazon.in/",
                "ebay", "https://www.ebay.com",
                "walmart", "https://www.walmart.com"
        );

        // Validate website
        if (!supportedWebsites.containsKey(website.toLowerCase())) {
            throw new InvalidWebsiteException("Website not supported. Available options: amazon, ebay, walmart.");
        }

        // Validate URL format (simple check)
        if (!url.toLowerCase().contains(supportedWebsites.get(website.toLowerCase()))) {
            throw new InvalidUrlException("Invalid URL for the specified website.");
        }

        return scraperService.scrapeWebsite(website.toLowerCase(), url);
    }

    // Custom exception for unsupported websites
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class InvalidWebsiteException extends RuntimeException {
        public InvalidWebsiteException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid URLs
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class InvalidUrlException extends RuntimeException {
        public InvalidUrlException(String message) {
            super(message);
        }
    }
}
