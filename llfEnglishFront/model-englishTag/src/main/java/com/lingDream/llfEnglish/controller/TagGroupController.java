package com.lingDream.llfEnglish.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lingDream.llfEnglish.entity.TagGroup;
import com.lingDream.llfEnglish.tool.result.Result;
import com.lingDream.llfEnglish.tool.result.ResultCode;
import com.lingDream.llfEnglish.tool.root.ThereController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-04-21 10:37
 */
@RestController
@Controller
@RequestMapping(value = "/wordTagGroup")
public class TagGroupController extends ThereController<TagGroup> {

    public TagGroupController(IService<TagGroup> service) {
        super(service, "单词标签组");
    }

    @RequestMapping("/list")
    public Result list() {
        final List<TagGroup> list = service.list();
        return new Result(ResultCode.SUCCESS, list);
    }
}
