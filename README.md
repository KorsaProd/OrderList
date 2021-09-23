The program which shows a order status,
with checking the quantity of goods before sending to the customer from JSON file

example:

  input: 
  [
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
