package com.sports.service;

import com.alibaba.fastjson.JSONArray;
import com.sports.common.ServerResponse;
import com.sports.entity.Course;
import org.springframework.web.multipart.MultipartFile;

public interface CourseService {

    /**
     * 年龄段的获取 回显
     * @return
     */
    JSONArray ageGroupList();

    /**
     * 课程的添加接口
     * @param file
     * @param course
     * @return
     */
    ServerResponse<String> addCourse (MultipartFile file , Course course);

    /**
     * 课程的查询 按照name
     * @param course
     * @return
     * @throws Exception
     */
    ServerResponse selectByName(Course course)throws Exception;

    /**
     * 根据id获取图片链接
     * @param course
     * @return
     * @throws Exception
     */
    ServerResponse getVideoUrl (Course course)throws Exception;

    /**
     * 课程的查询 按照type
     * @param course
     * @return
     * @throws Exception
     */
    ServerResponse selectByType(Course course) throws Exception;

    /**
     * 课程的删除
     * @param course
     * @return
     */
    String deleteCourse(Course course);
}
