/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        ListNode* main=list1;
        b-=a--;
        b++;
        while(a--) main=main->next;
        ListNode* temp=main->next;
        main->next=list2;
        while(b--) temp=temp->next;
        while(main->next!=NULL) main=main->next;
        main->next=temp;
        return list1;
    }
};