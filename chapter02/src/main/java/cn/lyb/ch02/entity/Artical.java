package cn.lyb.ch02.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zhengjianc
 * @since  2019/8/6 23:53
 */
@Data
@Accessors(chain = true)
@Builder
public class Artical {
    private Long id;

    private String author;

    private String title;

    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
