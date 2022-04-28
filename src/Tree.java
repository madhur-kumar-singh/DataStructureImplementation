public class Tree {
    public static void main(String[] args) {
        System.out.println();
    }
}
//    class Node {
//        int data;
//        Node left;
//        Node right;
//    }
//
//    Node root;
////to find hieght
//    public int ht(Node nn) {
//        if (nn == null)
//            return -1;
//        int l = ht(nn.left);
//        int r = ht(nn.right);
//        return Math.max(l, r) + 1;
//    }
////to find diameter with o(n^2)
//    public int dis(Node nn) {
//        if (nn == null)
//            return 0;
//        int l = dis(nn.left);
//        int r = dis(nn.right);
//        int self_dis = ht(nn.left) + ht(nn.right) + 2;
//        return Math.max(l, Math.max(r, self_dis));
//    }
////to find diameter with o(n)
//    class htDiaP {
//        int Dia = 0;
//        int ht = -1;
//    }
//
//    public htDiaP dia2(Node nn) {
//        if (nn == null)
//            return new htDiaP();
//        htDiaP l = dia2(nn.left);
//        htDiaP r = dia2(nn.right);
//        int self_dis = l.ht + r.ht + 2;
//        htDiaP ans = new htDiaP();
//        ans.Dia = Math.max(self_dis, Math.max(l.Dia, r.Dia));
//        ans.ht = Math.max(l.ht, r.ht) + 1;
//        return ans;
//    }
//    //to find if the tree is balanced or not with o(n^2)
//    public boolean isBal(Node nn){
//        if(nn==null)
//            return true;
//
//        boolean l=isBal(nn.left);
//        boolean r=isBal(nn.right);
//        boolean self=Math.abs(ht(nn.left)-ht(nn.right))<=1;
//        return l&&r&&self;
//    }
//    //to find if the tree is balanced or not in o(n)
//    class isBalHt{
//        int ht=-1;
//        boolean isBal=true;
//    }
//    public isBalHt isBal2(Node nn){
//        if(nn==null)
//        return new isBalHt();
//        isBalHt l=isBal2(nn.left);
//        isBalHt r=isBal2(nn.right);
//        boolean self=Math.abs(l.ht-r.ht)<=1;
//        isBalHt ans=new isBalHt();
//        ans.isBal=l.isBal&&r.isBal&& self;
//        ans.ht=Math.max(l.ht,r.ht)+1;
//        return ans;
//    }
//    public boolean isBST(Node nn){
//        if(nn==null)
//            return true;
//        boolean l=isBST(nn.left);
//        boolean r=isBST(nn.right);
//        boolean self=(Max(nn.left)<=nn.data) && (Min(nn.right)>nn.data);
//        return l&&r&&self;
//    }
//    class isBstM{
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        boolean isBST=true;
//    }
//    public isBstM isBST2(Node nn){
//        if(nn==null)
//            return new isBstM();
//        isBstM l=isBST2(nn.left);
//        isBstM r=isBST2(nn.right);
//        boolean self=(l.max<nn.data) &&(r.min>nn.data);
//    }

//}