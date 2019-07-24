## Sales Database<br>

Create a database for storing data about sales using the Code First approach. The database should have the
following tables:
- product (id, name, quantity, price)
- customer (id, name, email, credit_card_number)
- store_location (id, location_name)
- sale (id, product_id, customer_id, store_location_id, date)<br>

The relationships between the tables are as follows:
-Sale has one product and a product can be sold in many sales
- Sale has one customer and a customer can participate in many sales
- Sale has one store location and one store location can have many sales
