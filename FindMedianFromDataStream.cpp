class MedianFinder {
public:
    priority_queue<double> leftmaxheap;
    priority_queue<double,vector<double>,greater<int>> rightminheap;
    MedianFinder() {
        
    }
    
    void addNum(int num) {
        if(leftmaxheap.empty() || num<=leftmaxheap.top()){
            leftmaxheap.push(num);
        }
        else{
            rightminheap.push(num);
        }
        if(leftmaxheap.size()>1+rightminheap.size()){
            int x=leftmaxheap.top();
            rightminheap.push(x);
            leftmaxheap.pop();
        }
        else if(rightminheap.size()>leftmaxheap.size()){
            int y=rightminheap.top();
            leftmaxheap.push(y);
            rightminheap.pop();
        }
    }
    
    double findMedian() {
        if(leftmaxheap.size()==rightminheap.size()){
            return(leftmaxheap.top()+rightminheap.top())/2;
        }
        else if(leftmaxheap.size()>rightminheap.size()){
            return leftmaxheap.top();
        }
        else {
            return rightminheap.top();
        } 
    }
    int main(){}
};
