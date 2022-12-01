# ProjectX
# Pack-Man

Pack-Man is a Courier delivery system which has multiple enterprises.

### **User Roles**

**Customer:**

**The customer can perform the following actions:**

1. Login:

The customer has to login on Pack-man in order to search the nearby Packing services, track shipment if any or post a query.

If the customer is an already existing member, click on the login button and enter the ID.

If the customer is not a member, then he/she has to register in order to access Packman.

1. Search:

The customer can search for any packing services near them by selecting the city name under the dropdown and entering the postal code.

1. Track Shipment:

The customer can track their package

1. Contact us:

Here the customer can contact if needed

**SysAdmin:**

Enterprise Admin CRUD

**Enterprise Admin:**

- RM CRUD (Employee Management)
- Package Status Modification(Transport Service)
- Reply to customer(Customer Service)

**Regional Manager:**

CSA CRUD

Franchise CRUD

**Customer Service Associate:**

Package CRUD

### **Enterprise:**

**Transport service:**

1. Customer Flow:
  1. Enter tracking ID:

Here the customer has to enter their customer tracking id in order to track their package.

  1. Shipment Details(To, From, ShipmentID, Table for Status)

Here the customer can see their shipping details such as name, address, postal code, number, email id of both the customer and the receiver.

Every customer will be given a Shipment ID as well as a table of status will also shown to the customer in order to check the status.

1. Transport Admin Flow:
  1. Manage ~~Package~~ ( **Shipment** ) Details to update Status

Can Manage and update the status

**Customer service:**

1. Customer Flow:
  1. List of FAQs (search Functionality)

Here the customer can see the list of frequently asked questions with the answers if they have any doubt.

  1. Text area for new query

If the customer can't find the questions they wanted to know then there is a text area were the customer can write their new query

1. CS:
  1. List of un-answered queries with text area to reply to selected query

Here the new query written by the customer is answered and added to the FAQs list

**Employee Management System:**

1. Manage CSA or Manage Franchise Screen
2.

1. CSA CRUD
  1. Filter Functionality by Franchise(optional) else display all.

Here the customer can select their preferred Franchise using filter option otherwise it will display all the franchise by default.

  1. System Admin

Enterprise CRUD

  1. Enterprise Admin

RM CRUD (Package Management), Transport Admin CRUD and Customer Representative CRUD

  1. RM Admin

CSA CRUD, Franchise CRUD

  1. Transport Admin

Status update for shipment

  1. Customer Representative

FAQ, update un-answered queries

1. Franchise CRUD(with table view)

Here the customer can see all the available Franchise options

**Package Management System:**

1. Customer Flow:
  1. Search for nearby Franchise

In order to place the package in person, customers can search for a nearby Franchise.

  1. Request for package

Here the customer can request for package

1. Customer Service AssociateFlow:
  1. Shipment & Package CRUD

Here the employee is in the CSA they can edit the **FROM** data.




**CLASS DIAGRAM:**


![ProjectX_ClassDiagram](https://user-images.githubusercontent.com/113518157/205134549-1dc577e8-f27f-435f-9c69-31c07ab0c86e.jpg)


**SEQUENCE DIAGRAM:**


![Pack-man (1)-Sequence Diagram](https://user-images.githubusercontent.com/113518157/205135999-1a2e5383-1d3f-47c2-b192-e196c058dcd3.jpg)
