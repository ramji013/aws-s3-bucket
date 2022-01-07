package com.ram.awsimageupload.bucket;

public enum BucketName {
    profile_image("ram-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
