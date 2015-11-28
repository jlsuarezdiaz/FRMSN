////////////////////////////////////////////////////////////////////////////////
// Author: Juan Luis Suarez Diaz
// Jun, 2015
// Dropbox MSN
////////////////////////////////////////////////////////////////////////////////
package Model;

/**
 * MessageKind enum.
 * Displays every way a message can take.
 * @author Juan Luis
 */
public enum MessageKind {
    HELO,LOGIN,SEND,CHANGEPRIVATE,CHANGESELECT,CHANGESTATE,OK,ERR,BYE;
}
