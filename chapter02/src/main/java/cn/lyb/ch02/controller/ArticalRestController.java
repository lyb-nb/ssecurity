package cn.lyb.ch02.controller;

import cn.lyb.ch02.common.CommonResponse;
import cn.lyb.ch02.entity.Artical;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author lyb
 * @since 2019/8/6 23:59
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticalRestController {
    @PostMapping(value = "/save", produces = "application/json")
    public CommonResponse saveArticle(@RequestBody Artical artical) {
        log.info("saveArtical：{}", artical);
        return CommonResponse.success(artical);
    }

    @DeleteMapping(value = "/delete/{id}", produces = "application/json")
    public CommonResponse deleteArticle(@PathVariable Long id) {
        log.info("deleteArticle：{}", id);
        return CommonResponse.success(id);
    }

    @PutMapping(value = "/put/{id}", produces = "application/json")
    public CommonResponse updateArticle(@PathVariable Long id, @RequestBody Artical article) {
        article.setId(id);
        log.info("updateArticle：{},id: {}", article, id);
        return CommonResponse.success(article);
    }

    @GetMapping(value = "/get/{id}", produces = "application/json")
    public CommonResponse getArticle(@PathVariable Long id) {

        Artical artical = Artical.builder()
                .id(id).author("zimug")
                .content("spring boot 2.深入浅出")
                .createTime(new Date())
                .title("t1").build();
        return CommonResponse.success(artical);
    }
}
