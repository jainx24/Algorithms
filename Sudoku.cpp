// References https://www.geeksforgeeks.org/backtracking-set-7-suduku/

#include <iostream>
using namespace std;

#define N 9

bool findUnassigned(int grid[N][N], int &row, int &col)
{
    for(row=0;row<N;row++)
        for(col=0;col<N;col++)
            if(grid[row][col]==0)
                return true;
    return false;
}

bool usedInRow(int grid[N][N], int row, int num)
{
    int col;
    
    for(col=0;col<N;col++)
        if(grid[row][col]==num)
            return true;
    return false;
}

bool usedInCol(int grid[N][N], int col, int num)
{
    int row;
    
    for(row=0;row<N;row++)
        if(grid[row][col]==num)
            return true;
    return false;
}

bool usedInBox(int grid[N][N], int row, int col, int num)
{
    int startOfRow = row - row%3;
    int startOfCol = col - col%3;
    
    for(row=0;row<3;row++)
        for(col=0;col<3;col++)
            if(grid[row+startOfRow][col+startOfCol]==num)
                return true;
    return false;
}

bool isSafe(int grid[N][N], int row, int col, int num)
{
    return !usedInRow(grid,row,num) && !usedInCol(grid,col,num) && !usedInBox(grid,row,col,num);
}

void printGrid(int grid[N][N])
{
    int row,col;
    for(row=0;row<N;row++)
	{
	    for(col=0;col<N;col++)
	        cout<<grid[row][col]<<" ";
	    cout<<endl;
	}
}

bool solveSoduku(int grid[N][N])
{
    int row,col,num;
    
    if(!findUnassigned(grid,row,col))
    {
        printGrid(grid);
        return true;
    }
    
        
    for(num=1;num<=9;num++)
    {
        if(isSafe(grid,row,col,num))
        {
        grid[row][col]=num;
         
        if(solveSoduku(grid))
            return true;
        
        grid[row][col]=0;
        }
    }
        
    return false;
}

int main() {

    int t,tst;
    cin>>t;
    
    for(tst=0;tst<t;tst++)
    {
	int grid[N][N],row,col;
	
	for(row=0;row<N;row++)
	    for(col=0;col<N;col++)
	        cin>>grid[row][col];
	
	if(!solveSoduku(grid))
	    cout<<"Solution is not possible";
	
    }
	return 0;
}
