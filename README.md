# FoodMania

A dine-and-deliver digital dashboard.

## Overview

FoodMania is a full-stack food delivery application designed to connect users with local restaurants, view menus, add items to a cart, and place orders seamlessly. It features a modern frontend for browsing and ordering, and a robust backend for managing restaurants, food items, and orders.

## Features

- Browse restaurants and their menus
- Add food items to a shopping cart
- Place orders with detailed itemization (price, delivery fee, tax, GST charges)
- User authentication (Sign up, login, password reset)
- View past orders and order details
- Responsive design for a smooth user experience

## Tech Stack

- **Frontend:** JavaScript (React), HTML, CSS
- **Backend:** Java (Spring Boot)
- **Database:** (Assumed JPA/Hibernate, details in backend source)
- **APIs:** RESTful endpoints for food items, restaurants, and orders

## Directory Structure

```
FoodMania/
├── frontend/                      # React frontend app
│   ├── src/
│   │   ├── pages/                 # Main UI pages (Home, Menu, Cart, Payment, etc.)
│   │   └── components/            # Reusable UI components
│   └── public/                    # Static public files
├── food-delivery-app/             # Spring Boot backend app
│   ├── src/main/java/com/gouri_n/food_delivery_app/
│   │   ├── controllers/           # REST controllers (FoodItemController, OrderController, etc.)
│   │   ├── dto/                   # Data transfer objects (OrderRequest, FoodItemRequest)
│   │   ├── entity/                # JPA entities (FoodItem, Restaurant, UserOrder, OrderItem)
│   │   ├── repository/            # JPA repositories
│   │   └── FoodDeliveryAppApplication.java # Main backend entry point
└── README.md                      # This file
```

## Usage

### Running the Backend (Spring Boot)

1. Ensure you have Java and Maven installed.
2. Navigate to `food-delivery-app/`.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. The backend will start at `http://localhost:8080`.

### Running the Frontend (React)

1. Ensure you have Node.js and npm installed.
2. Navigate to `frontend/`.
3. Install dependencies:
   ```bash
   npm install
   ```
4. Start the development server:
   ```bash
   npm start
   ```
5. The frontend will run at `http://localhost:3000` and communicate with the backend.

### Example API Endpoints

- **Get Restaurant Menu:**  
  `GET /food-items/menu/{restaurantId}`

- **Add Food Item:**  
  `POST /food-items`  
  Body: `{ id, name, price, restaurantId }`

- **Place Order:**  
  `POST /orders`  
  Body: includes price, delivery fee, tax, platform fee, gst charges, items, etc.

## Key Classes & Flow

- **FoodItemController / FoodItemService:**  
  Handles adding food items, fetching restaurant menus.
- **OrderController:**  
  Handles order placement, calculates platform fee, GST, and processes itemization.
- **Entities:**  
  - `FoodItem` — Represents a menu item.
  - `UserOrder` — Represents a user’s order, including items and charges.
  - `OrderItem` — Individual item in an order.

## License

*No license specified yet.*

## Author

- [gourichaturvedi](https://github.com/gourichaturvedi)

---


