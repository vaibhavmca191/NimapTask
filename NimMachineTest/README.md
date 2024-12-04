How did you run the code?
Ensure Java and Maven are Installed: Access the Application: The application should be running on http://localhost:8080. You can test the API using tools like Postman or cURL. Pagination verified using the page and size query parameters.

How did you run the machine test?
To run the machine test with pagination, you would need to: Ensure Database Setup: Ensure your database is running.

First we need to create one databae and that database name is records because that name added in application.properties.

Configure the database connection in application.properties. In this application.properties we need change one command when running first time this application for automatically creating the one table database that is create command spring.jpa.hibernate.ddl-auto=create. After that second time for CRUD operations we need to replace create with update.

Test APIs for Pagination: Test the GET /api/categories?page=0&size=5 API to check the server-side pagination for categories. Test the GET /api/products?page=0&size=5 API to check pagination for products.

Test CRUD Operations: Create, update, and delete categories and products by sending POST, PUT, and DELETE requests via Postman or cURL. Check for correct category-product relationships.

Validation: Verify if pagination works correctly by checking the responses for multiple pages. Ensure the category and product relations are correctly maintained, with the products appearing under their respective categories when requested.

DB Design
Category Table

id INT Primary key, Auto-increment DB Design Here is the basic database design for your Category and Product entities:

Category Table id INT Primary key, Auto-increment name VARCHAR Name of the category

Product Table

id INT Primary key, Auto-increment name VARCHAR Name of the product price DECIMAL Price of the product cid INT Foreign key to Category table

Relationships One-to-Many Relationship: A single Category can have multiple Products, but each Product is linked to one Category.

Foreign Key: The Product table contains a cid column that references the id of the Category table, creating the relationship.
