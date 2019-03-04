package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private Long id;
    private String name;
    private Address address;

    /**
     * @param id      - id of person
     * @param name    - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this(Long.MIN_VALUE, "", new Address());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', address=%s}", id, name, address.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        } else {
            Person personToCompare = (Person) o;
            return idEquals(personToCompare.getId()) &&
                    nameEquals(personToCompare.getName()) &&
                    addressEquals(personToCompare.getAddress());
        }
    }

    public boolean idEquals(Long id) {
        if (this.id == null) {
            return id == null;
        } else {
            return id.equals(this.id);
        }
    }

    public boolean nameEquals(String name) {
        if (this.name == null) {
            return name == null;
        } else {
            return name.equals(this.name);
        }
    }

    public boolean addressEquals(Address address) {
        if (this.address == null) {
            return address == null;
        } else {
            return address.equals(this.address);
        }
    }
}