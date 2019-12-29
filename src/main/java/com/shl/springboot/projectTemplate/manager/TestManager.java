package com.shl.springboot.projectTemplate.manager;

import com.github.pagehelper.PageHelper;
import com.shl.springboot.projectTemplate.domain.entity.TestProjectTemplate;
import com.shl.springboot.projectTemplate.domain.entity.TestProjectTemplateExample;
import com.shl.springboot.projectTemplate.domain.mapper.TestProjectTemplateMapper;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songhengliang
 * @date 2019/12/29
 */
@Component
public class TestManager {
    private static final Logger logger = LoggerFactory.getLogger(TestManager.class);


    @Resource
    private TestProjectTemplateMapper testProjectTemplateMapper;

    /**
     * testPage
     * @return
     */
    public List<TestProjectTemplate> testPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TestProjectTemplateExample example = new TestProjectTemplateExample();
        TestProjectTemplateExample.Criteria criteria = example.createCriteria();

        example.setOrderByClause("id asc");

        return this.testProjectTemplateMapper.selectByExample(example);

    }

}
