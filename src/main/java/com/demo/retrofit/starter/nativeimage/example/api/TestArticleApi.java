package com.demo.retrofit.starter.nativeimage.example.api;

import com.demo.retrofit.starter.nativeimage.example.client.UserServiceClient;
import com.demo.retrofit.starter.nativeimage.example.pojo.Article;
import com.demo.retrofit.starter.nativeimage.example.pojo.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestArticleApi {

    private final UserServiceClient userServiceClient;

    @GetMapping("/article")
    public Article getArticleInfo(String id) {
        Article article = new Article();

        article.setId(id);
        article.setTitle("This is a example article");
        article.setContent("Lorem ipsum dolor sit amet consectetur adipisicing elit. Soluta praesentium, quae voluptas aut commodi placeat, sed, iusto quasi perferendis natus esse. Quasi ipsa, repellendus accusamus tempore autem ex culpa expedita.");
        article.setAuthor(userServiceClient.getUserInfo("1"));

        return article;
    }

}
