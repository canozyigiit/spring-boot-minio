package com.canozyigit.springbootminio.service;

import io.minio.messages.Bucket;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public interface MinioService {
    /** *  Judge  bucket Whether there is  * * @param bucketName * @return */
    boolean bucketExists(String bucketName);

    /** *  establish  bucket * * @param bucketName */
    void makeBucket(String bucketName);

    /** *  List all bucket names  * @return */
    List<String> listBucketName();

    /** *  List all buckets   Information  * * @return */
    List<Bucket> listBuckets();

    /** *  Delete bucket according to bucket name  * @param bucketName */
    boolean removeBucket(String bucketName);

    /** *  List all object names in the bucket  * @param bucketName * @return */
    List<String> listObjectNames(String bucketName);

    /** *  Upload files  * * @param multipartFile * @param bucketName */
    String putObject(MultipartFile multipartFile, String bucketName, String fileType);

    /** *  File stream download  * @param bucketName * @param objectName * @return */
    InputStream downloadObject(String bucketName, String objectName);


    /** *  Delete file  * @param bucketName * @param objectName */
    boolean removeObject(String bucketName, String objectName);



    /** *  Delete files in bulk  * @param bucketName * @param objectNameList * @return */
    boolean removeListObject(String bucketName, List<String> objectNameList);

    /** *  Get file path  * @param bucketName * @param objectName * @return */
    String getObjectUrl(String bucketName,String objectName);
}

