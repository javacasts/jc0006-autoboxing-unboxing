package net.javacasts.example.props;

import org.springframework.stereotype.Component;

@Component
public class DocumentService {

    public Document find(Long id) {
        return new Document(id, "Document with the ID " + id, null);
    }
}
