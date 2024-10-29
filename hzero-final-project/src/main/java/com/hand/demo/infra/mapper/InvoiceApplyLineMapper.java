package com.hand.demo.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import com.hand.demo.domain.entity.InvoiceApplyLine;

import java.util.List;

/**
 * (InvoiceApplyLine)应用服务
 *
 * @author ariel.peaceo@hand-global.com
 * @since 2024-05-21 14:06:56
 */
public interface InvoiceApplyLineMapper extends BaseMapper<InvoiceApplyLine> {
    /**
     * 基础查询
     *
     * @param invoiceApplyLine 查询条件
     * @return 返回值
     */
    List<InvoiceApplyLine> selectLine(InvoiceApplyLine invoiceApplyLine);

    List<InvoiceApplyLine> selectExport(InvoiceApplyLine invoiceApplyLine);
}

