package app.builder;

public record TShirt(String name,
                     String color,
                     String manufacturer,
                     double price) implements Product {
}

