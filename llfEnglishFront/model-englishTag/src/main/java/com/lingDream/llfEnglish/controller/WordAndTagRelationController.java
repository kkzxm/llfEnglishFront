package com.lingDream.llfEnglish.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lingDream.llfEnglish.entity.WordAndTagRelation;
import com.lingDream.llfEnglish.tool.root.ThereController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-04-21 10:37
 */
@RestController
@Controller
@RequestMapping(value = "/wordToTag")
public class WordAndTagRelationController extends ThereController<WordAndTagRelation> {

    public WordAndTagRelationController(IService<WordAndTagRelation> service) {
        super(service, "单词与标签关系");
    }


}
