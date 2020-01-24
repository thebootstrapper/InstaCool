package projet2.demo;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class PublicationForm {
    private MultipartFile publication;

    public PublicationForm(){};



    @Override
    public String toString() {
        return "PublicationForm{" +
                "publication=" + publication +
                '}';
    }


    public MultipartFile getPublication() {
        return publication;
    }

    public void setPublication(MultipartFile publication) {
        this.publication = publication;
    }
}
