The program which shows a order status,
with checking the quantity of goods before sending to the customer.
Where event_id is a sequence of events and purpose is:

    Process the list of events and display the final list of goods to be sent for each order. 
    For each product, you only need the last event (event with the maximum event_id value)
    among the events, information about this product.
    
Parsing occur from JSON file.

example:

    input: [
    {
        "event_id": 2,
        "order_id": 2,
        "item_id": 1,
	"count": 3,
	"return_count": 1,
	"status": "OK"
    },
    {
        "event_id": 1,
	"order_id": 1,
	"item_id": 1,
	"count": 2,
	"return_count": 0,
	"status": "OK"
    },
    {
        "event_id": 3,
        "order_id": 3,
        "item_id": 1,
        "count": 2,
        "return_count": 2,
        "status": "OK"
    }
    ]

    otput: 
    event id: 2
    items:
        count: 2
        item id: 1
