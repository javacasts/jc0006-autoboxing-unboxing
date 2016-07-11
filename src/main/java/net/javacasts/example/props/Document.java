package net.javacasts.example.props;

public class Document {

    private Long    id;
    private String  name;
    private Boolean pub;
    
    public Document(Long id, String name, Boolean pub) {
        this.id = id;
        this.name = name;
        this.pub = pub;
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

    public Boolean isPublic() {
        return pub;
    }

    public void setPublic(Boolean pub) {
        this.pub = pub;
    }
}
