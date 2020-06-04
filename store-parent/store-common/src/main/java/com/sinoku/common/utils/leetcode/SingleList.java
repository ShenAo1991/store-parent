package com.sinoku.common.utils.leetcode;

import com.sinoku.common.utils.model.SingleNode;

/**
 * @ClassName SingleList
 * @Description
 * @Author
 * @Date 2020/6/4 下午1:24
 **/
public class SingleList {


  public static void main(String[] args) {
    SingleNode node1 = new SingleNode();
    SingleNode node2 = new SingleNode();
    SingleNode node3 = new SingleNode();
    SingleNode node4 = new SingleNode();
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = null;
    node1.val = 1;
    node2.val = 2;
    node3.val = 3;
    node4.val = 4;
    reverseList1(node1);
  }


  /**
   * 非递归方式
   * @param singleNode
   * @return
   */
  public static SingleNode reverseList1(SingleNode singleNode){
    SingleNode pre = null;
    SingleNode cur = singleNode;
    while (cur!=null){
      SingleNode tmp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = tmp;
    }
    return pre;
  }


}
