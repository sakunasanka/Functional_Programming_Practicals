object question03{
    def main(args: Array[String]): Unit={
        
    }

    def attendees(ticket_price:Int)={
        120 + (15 - ticket_price)/5 * 20
    }

    def revenue(ticket_price:Int)={
        attendees(ticket_price) * ticket_price
    }

    def cost(ticket_price:Int)={
        500 + 3*attendees(ticket_price)
    }

    def profit(ticket_price:Int)={
        revenue(ticket_price) - cost(ticket_price)
    }

}