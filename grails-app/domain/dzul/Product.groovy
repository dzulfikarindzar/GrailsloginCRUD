package dzul

class Product {

    String prodNumber
    String prodName
    String prodCategory
    String prodDesc
    Double prodPrice

    static constraints = {
        prodNumber nullable: false, blank: false
        prodName nullable: false, blank: false
        prodCategory nullable: false, blank: false
        prodDesc nullable: false, blank: false
        prodPrice nullable: false, blank: false
    }

    String toString() {
        prodName
    }
}