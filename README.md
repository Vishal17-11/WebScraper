🚀 What I Built
I built a Web Scraper API that allows users to collect structured data from complex, interactive websites like Amazon, eBay, and Walmart. This project provides an intuitive API where users can input the website and URL they want to scrape, and it returns the extracted data in a clean, structured format (JSON).

The scraper handles dynamic web content, JavaScript rendering, and pagination thanks to Bright Data’s powerful scraping technology. This solution helps businesses with:

Price aggregation: Collect and compare product prices from multiple e-commerce platforms.
Competitor monitoring: Track competitors' products, prices, and promotions.
Review aggregation: Gather user reviews from e-commerce and service platforms.
📸 Demo
Here’s a quick demonstration of how the API works.

1️⃣ Input
API Request Example:



POST /scrape

![Image description](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/nve5b4p8ay6layd92uoy.png)2️⃣ Response
Example Response (JSON):


![Image description](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/0vy2xdmswuf1nneifrsn.png)
3️⃣ UI Demo Screenshots


The API is simple and accessible via Postman, cURL, or any HTTP client. It supports multiple websites like Amazon, eBay, Walmart, and more.

🛠️ How I Used Bright Data
Bright Data was essential in handling the challenges of scraping dynamic, interactive, and JavaScript-heavy websites. Many modern sites load product details asynchronously, which traditional scrapers fail to capture. However, using Bright Data's Web Scraper API, I could easily:

Overcome CAPTCHA blocks
Handle client-side JavaScript rendering
Navigate complex, multi-step user interactions
Paginate through long lists of products
🔥 Key Complexities Overcome
1️⃣ Dynamic Content Rendering
Websites like Amazon don't display content in raw HTML. Instead, they use JavaScript rendering to load product details. Using Bright Data’s browser-like capabilities, I was able to extract all product details dynamically.

2️⃣ Anti-Bot Measures
E-commerce sites employ CAPTCHAs and rate limits. Bright Data’s system seamlessly bypassed these challenges using its proxy rotation and anti-bot bypassing features.

3️⃣ Pagination & Infinite Scrolling
For websites with infinite scrolling, the API intelligently scrolls the page to load more content, ensuring that no product listing is missed.

📚 How It Works
The project is built using Spring Boot (Java) and integrates with Bright Data’s Web Scraper API.

⚙️ Technologies Used
Spring Boot: For building the REST API.
Bright Data Web Scraper API: To handle JavaScript rendering, CAPTCHA bypass, and proxy rotation.
Postman: For testing the API.
🚀 Setup & Usage
Run the Server

bash:
mvn spring-boot:run

Send an API Request

json:


![Image description](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/v31rh0eyuuaha2d5c4gw.png)
Receive API Response
The API returns product title, price, rating, reviews, and stock status.


🔥 Does this submission qualify for additional prompts?
Yes, this project qualifies for:

“Use Bright Data to handle CAPTCHA bypass and proxy rotation”
“Scrape data from an interactive, dynamic website”
“Aggregate data from multiple platforms”
These features were implemented using Bright Data's JavaScript rendering, proxy rotation, and CAPTCHA bypass functionality.

1️⃣ Clone the Repository
To clone the repository to your local machine, run the following command:
Navigate to the Project Directory
Once the repository is cloned, go to the project folder:


cd WebScraper

3️⃣ Pull Latest Changes
Before you start working on your changes, make sure you have the latest version of the repository:



git pull origin main

4️⃣ Create a New Branch for Your Changes
It's a good practice to create a new branch before making any changes. You can create a new branch by running:



git checkout -b new-feature-branch

5️⃣ Make Your Changes
Now you can make changes to the code. Once you're done, add and commit your changes:


git add .

git commit -m "Your commit message"

6️⃣ Push Your Changes to GitHub
After committing your changes, push the new branch to GitHub:


git push origin new-feature-branch

7️⃣ Create a Pull Request
Once you've pushed your changes, go to the repository on GitHub and open a pull request to merge your changes into the main branch.

🤝 Team Credits
This project was developed solo.

License
This project is licensed under the MIT License - see the LICENSE file for details.

