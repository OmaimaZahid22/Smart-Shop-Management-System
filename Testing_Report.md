# Testing Report

## 1. Introduction

This report describes the testing of input validation in the Smart Shop Management System. The purpose is to check that invalid product information is handled properly.

## 2. Test Cases

| Test ID | Test Scenario | Input | Expected Output |
|---|---|---|---|
| TC01 | Add null product | null | Invalid product! |
| TC02 | Add duplicate product ID | Existing ID | Product ID already exists! |
| TC03 | Add product with empty name | Empty name | Invalid product information! |
| TC04 | Add product with negative price | -100 | Invalid product information! |
| TC05 | Add product with negative quantity | -5 | Invalid product information! |
| TC06 | Add product when array is full | 101st product | Product storage is full! |
| TC07 | Update product with invalid information | Empty name or negative price | Invalid information! |

## 3. Conclusion

Input validation helps prevent invalid product information from being added or updated in the system.
