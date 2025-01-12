### Currency Converter API 🌍💱

This is a **Spring Boot-based Currency Converter API** that allows users to convert a specified amount from one currency to another. The API processes JSON input and returns the **converted amount** based on predefined exchange rates.

---

### Features ✨

- 🌐 **Currency Conversion**: Converts a given amount from one currency to another and returns the converted value.
- 📥 **JSON Input**: Accepts structured JSON requests for seamless integration.
- 📤 **Scalable Design**: Designed for scalability and maintainability using Spring Boot.

---

### API Endpoint 🛠️

**Base URL**: `/CurrencyConvert`

#### HTTP Method: `GET`

- **Request Body**:
  ```json
  {
      "currencyFrom": "INR",
      "amountFrom": 100.0,
      "currencyTo": "USD"
  }
  ```

- **Response**:
  ```json
  [
      {
          "currencyFrom": "INR",
          "amountFrom": 100.0,
          "currencyTo": "USD",
          "convertedAmount": 1.2
      }
  ]
  ```

---

### How to Use 🚀

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/currency-converter-api.git
   cd currency-converter-api
   ```

2. Build the project:
   ```bash
   ./mvnw clean install
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Test the endpoint using Postman, Curl, or any HTTP client:
   - Set the method to `GET`.
   - Use `/CurrencyConvert` as the endpoint.
   - Pass the JSON input in the request body.

---

### Technologies Used 🛠️
- **Spring Boot**: Java-based framework for building RESTful APIs.
- **Maven**: Dependency management and build tool.
- **Java**: Primary programming language.
- **JSON**: Data format for request and response.

---

### Future Enhancements 🌟
- 🔄 **Dynamic Exchange Rates**: Integrate real-time rates using third-party APIs like OpenExchangeRates or Forex.
- 📊 **Historical Data**: Add support for fetching historical exchange rates.
- 🧩 **Error Handling**: Enhanced exception handling and user-friendly error messages.

---

### Contribution Guidelines 🤝
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature description"
   ```
4. Push the branch:
   ```bash
   git push origin feature/your-feature
   ```
5. Create a Pull Request.

---

### License 📜
This project is licensed under the [MIT License](LICENSE).
