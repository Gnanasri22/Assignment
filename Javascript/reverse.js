function reverseWordsInSentence(sentence) {
    // Split the sentence into an array of words
    const words = sentence.split(' ');
  
    // Reverse each word in the array
    for (let i = 0; i < words.length; i++) {
      words[i] = reverseWord(words[i]);
    }
  
    // Join the reversed words to form a new sentence
    const reversedSentence = words.join(' ');
  
    return reversedSentence;
  }
  
  function reverseWord(word) {
    // Reverse the characters of a word
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
      reversed += word[i];
    }
    return reversed;
  }
  
  // Example usage:
  const inputSentence = "Today is Sunday";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);
  