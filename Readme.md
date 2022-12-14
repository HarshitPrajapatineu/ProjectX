#
# Pack-Man

Pack-Man is a Package delivery system which has multiple enterprises and user roles.

_ **User Roles:** _

**Customer:**

The customer can perform the following actions:

1. Login:

- If customer ID already exists, login to main screen
- If customer ID does not exist in DB, go to create Customer info and create an account.

1. Search:

- All the nearby packing services are displayed on the screen based on the city selected.
- A customer can also create a new package to be delivered by entering all the required details.

1. Track Shipment:

The customer can track the package by entering the Tracking ID.

1. Contact us:

- If the customer has any query, they can find it in the FAQs being displayed.
- If the query cannot be found on the FAQ section, they can post a new query.

**System Admin**

A system admin can Create, Read, Update and Delete (CRUD) all the other User roles.

**Employee Management Admin**

An Employee Management Admin can Create, Read, Update and Delete (CRUD) Regional Manager.

**Regional Manager**

A regional manager can Create, Read, Update and Delete (CRUD) Customer Service Associate.

**Transport Admin**

A transport Admin can update the status of a package using the Tracking ID.

**Customer Service Representative**

A customer Service Rep answers all the queries posted by the customer.

**Customer Service Associate**

A customer Service Associate can create packages and also update the status of an existing packing using the Tracking ID.

### _ **Enterprises:** _

**Transport service:**

Tracking and updating of package status.

**Customer service:**

Customers can be created. A customer can create a package, search for nearby packing services, track the package using Tracking ID, post queries if any.

**Employee management system:**

It has a number of User roles which include system Admin, Customer Service Representative, Transport Admin, Regional Manager, Customer Service Associate.

A customer Service Associate can create packages and also update the status of an existing packing using the Tracking ID.

**Package management system:**

A package can be created by either a Customer or an Employee. Each package has a Tracking ID, From address, ToAddress and a Franchise by which it is delivered.

**Sequence Diagram:**


![Pack-man-3-Sequence Diagram](https://user-images.githubusercontent.com/114259220/207509032-f2b61337-a853-4408-9c00-23e60b29dd27.jpg)


A customer Service Associate can create packages and also update the status of an existing packing using the Tracking ID.
