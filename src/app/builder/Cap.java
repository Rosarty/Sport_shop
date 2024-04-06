package app.builder;

public record Cap(String name,
                  String color,
                  String manufacturer,
                  double price) implements Product {
}


