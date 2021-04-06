package com.group.firebaseimage;

class ImageModel {
    String image;

    public ImageModel(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImageModel{" +
                "image='" + image + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageModel() {

    }
}
