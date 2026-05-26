package qrcode.generator.infrastructure;

import org.springframework.beans.factory.annotation.Value;
import qrcode.generator.ports.StoragePort;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.ByteArrayInputStream;

//public class S3StorageAdapter implements StoragePort {
//
//    private final S3Client s3client;
//    private final String bucketName;
//    private final String region;
//
//    public S3StorageAdapter(@Value("${aws.S3.region}") String region,
//                            @Value("${aws.s3.bucket-name}") String bucketName) {
//        this.bucketName = bucketName;
//        this.region = region;
//        this.s3client = S3Client.builder()
//                .region(Region.of(this.region))
//                .build();
//    }
//
//    @Override
//    public string uploadFile(byte[] fileData, String fileName, String contentType) {
//        PutObjectRequest
//    }
//}
