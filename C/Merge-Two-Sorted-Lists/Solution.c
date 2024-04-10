/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    
    
    //check if lists1/2 are empty
    if (list1 == NULL) return list2; 
    if (list2 == NULL) return list1;


    int option = 0; /*
                    0 refers to default
                    1 refers to list1 end reached
                    2 refers to list2 end reached
                    */
    
    struct ListNode  * temp = malloc(sizeof(struct ListNode));
    temp->next = NULL;
    struct ListNode * result = temp; //stores result

    //loop over lists
    while(list1 != NULL || list2 != NULL){

            if(list1 == NULL){
                option = 1;
                break;
            } 
            else if (list2 == NULL){
                option = 2;
                break;
            }
            else{            
                
            
            if(list1->val >= list2->val){
                temp->next =list2;
                list2 = list2->next;
            }
            else if(list1->val <= list2->val){
                temp->next = list1;
                list1 = list1->next;
            }        
            temp = temp->next;
        }

    }

    switch(option){
        case 1:
            temp->next = (list2);
            break;
        case 2:
            temp->next = (list1);
            break;
    }


    //return address of result
    return  result->next;
}
