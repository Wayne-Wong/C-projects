// Wayne Wong
// TIC TAC TOE
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

class tick {
	private:
		int location[10];
		char table[3][3];
	
	public:
		tick();
		void player1(void);
		void player2(void);
		void check(void);
		void display(void);
		void winner(int x);
		int check_player(void);
		int check_self(void);
};