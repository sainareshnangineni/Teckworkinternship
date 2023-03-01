
class Anogram
for(i = 0; i < str.length(); i++)
            {
            for(j = i+1; j < string.length; j++)
              {  
                if(string[i] == string[j]) 
                {
                  for( k=j;k<string.length-1;k++)
                      string[k]=string[k+1];
                  string[k]='\0';
                }
        }  