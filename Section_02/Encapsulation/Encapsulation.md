# Encapsulation

- **Definition**: Encapsulation is the process of binding data members (variables) and member functions (methods) together into a single unit (class)
- **Primary Goal**: Achieving **Data Hiding** and security.
- **How to implement**:
  1. Declare class variables as `private` (restricting direct external access).
  2. Provide `public` getter and setter methods to securely access and modify the data.

### Methods:
- **Getter method (`getName()`, `getId()`):** Used to fetch/retrieve data (read access).
- **Setter method (`setName(...)`, `setId(...)`):** Used to modify/validate data (write access).
