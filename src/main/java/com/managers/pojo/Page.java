package com.managers.pojo;

public class Page {
    //每一页显示多少
    private int count = 5;
    //总共多少页(总共多少条数据)
    private int total;
    //当前页面
    private int pageNow;
    //总页面数
    private int totalPage;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalPage() {
        //计算总页面,总条数取余每页显示的条数，为整数则不需要增加页面，反之增加一页
        if (total % count == 0) {
            totalPage = total / count;
        } else {
            totalPage = (total / count) + 1;
        }
        return totalPage;
    }
}
