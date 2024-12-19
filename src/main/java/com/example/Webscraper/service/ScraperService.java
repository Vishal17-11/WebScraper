package com.example.Webscraper.service;

import com.example.Webscraper.model.BrightDataRequest;
import com.example.Webscraper.model.BrightDataResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ScraperService {
    private final WebClient webClient;

    @Value("${brightdata.amazon.api.key}")
    private String amazonApiKey;

    @Value("${brightdata.ebay.api.key}")
    private String ebayApiKey;

    @Value("${brightdata.walmart.api.key}")
    private String walmartApiKey;

    public ScraperService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public BrightDataResponse scrapeWebsite(String website, String url) {
        String apiKey;

        // Select the API token for the specified website
        switch (website.toLowerCase()) {
            case "amazon":
                apiKey = amazonApiKey;
                break;
            case "ebay":
                apiKey = ebayApiKey;
                break;
            case "walmart":
                apiKey = walmartApiKey;
                break;
            default:
                throw new IllegalArgumentException("Website not supported. Available options: amazon, ebay, walmart.");
        }

        BrightDataRequest request = new BrightDataRequest(url,"us");

        return webClient.post()
                .uri("https://api.brightdata.com/v1/scraper")
                .header("Authorization", "Bearer " + apiKey)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(BrightDataResponse.class)
                .block();
    }
}
