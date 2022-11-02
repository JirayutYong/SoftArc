package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray jarr;
    private JSONObject obj;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
       
        jarr = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
 
        JSONObject obj = new JSONObject();
        obj.put(Book.Metadata.ISBN.value, b.getISBN());
        obj.put(Book.Metadata.TITLE.value, b.getTitle());
        obj.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        obj.put(Book.Metadata.AUTHORS.value, authors);

        jarr.add(obj);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
   
        return jarr.toString();
    }
}
