package com.wang.p2p.base.domain;

import com.wang.p2p.base.util.BidConst;

import java.math.BigDecimal;

public class Account extends BaseDomain{
    private int version;//对象版本信息（用作乐观锁）
    private String tradePassword; // 交易密码
    private BigDecimal usableAmount = BidConst.ZERO; // 账户可用金额
    private BigDecimal freezedAmount = BidConst.ZERO; // 账户冻结金额
    private BigDecimal unReceiveInterest = BidConst.ZERO;// 账户待收利息
    private BigDecimal unReceivePrincipal = BidConst.ZERO;// 账户待收本金
    private BigDecimal unReturnAmount = BidConst.ZERO; // 账户待还金额
    private BigDecimal remainBorrowLimit = BidConst.INIT_BORROW_LIMIT; // 账户剩余授信额度
    private BigDecimal borrowLimit = BidConst.INIT_BORROW_LIMIT; // 账户授信额度

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    public BigDecimal getUnReceiveInterest() {
        return unReceiveInterest;
    }

    public void setUnReceiveInterest(BigDecimal unReceiveInterest) {
        this.unReceiveInterest = unReceiveInterest;
    }

    public BigDecimal getUnReceivePrincipal() {
        return unReceivePrincipal;
    }

    public void setUnReceivePrincipal(BigDecimal unReceivePrincipal) {
        this.unReceivePrincipal = unReceivePrincipal;
    }

    public BigDecimal getUnReturnAmount() {
        return unReturnAmount;
    }

    public void setUnReturnAmount(BigDecimal unReturnAmount) {
        this.unReturnAmount = unReturnAmount;
    }

    public BigDecimal getRemainBorrowLimit() {
        return remainBorrowLimit;
    }

    public void setRemainBorrowLimit(BigDecimal remainBorrowLimit) {
        this.remainBorrowLimit = remainBorrowLimit;
    }

    public BigDecimal getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(BigDecimal borrowLimit) {
        this.borrowLimit = borrowLimit;
    }
}
