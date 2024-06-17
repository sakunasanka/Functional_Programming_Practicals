//q1
def areaOfDisk(radius:Double)=math.Pi*radius*radius

//q2
def fahrenheit(celcius:Double):Double=celcius*1.8000 + 32.00

//q3
def vol_sphere(radius:Double):Double=(4.0/3.0)*math.Pi*radius*radius*radius

//q4
def wholesale_cost(copies: Int): Double = { val book_price = 24.95; val discount = 0.4; val shipping_cost = 3.0; val additional = 0.75; val discount_price = book_price * (1 - discount); val total_shipping = if (copies <= 50) shipping_cost else shipping_cost + (copies - 50) * additional; discount_price * copies + total_shipping }

//q5
def easy_pace(distance:Double):Double=8*distance; def tempo(distance:Double):Double=7*distance;def total_run_time(d1:Double,d2:Double,d3:Double):Double=easy_pace(d1)+tempo(d2)+easy_pace(d3)
