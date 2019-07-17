package com.stackroute.kafka.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
import java.util.Arrays;

@Data
public class Category {

    @Id
    int categoryId;
    String categoryName;
    BigDecimal price;
    String[] additionalAmenities;
    // categoryId;
//    categoryName;
//    price;
//    additionalAmenities;
    private Dimension dimension;
    public Dimension getDimension() {
        return dimension;
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    public Category() {
    }

    public Category(int categoryId, String categoryName, BigDecimal price, String[] additionalAmenities) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.price = price;
        this.additionalAmenities = additionalAmenities;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public String[] getAdditionalAmenities() {
        return additionalAmenities;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", additionalAmenities=" + Arrays.toString(additionalAmenities) +
                ", dimension=" + dimension +
                '}';
    }
}
