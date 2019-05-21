var token = 'k18VBiR9Sr1-acQSG_8QzruEA4NDaYfNK4LFoIo7VNhhmvwRYWI';

var date = new Date();
var now_utc = Date.UTC(date.getUTCFullYear(), date.getUTCMonth(), date.getUTCDate(), date.getUTCHours(), date.getUTCMinutes(), date.getUTCSeconds());

var Http = new XMLHttpRequest();
var url = 'https://api.pandascore.co/matches?filter[begin_at]=' + now_utc + '&sort=begin_at&token=' + token;
Http.open("GET", url);
Http.send();

Http.onreadystatechange=(e)=>{
  console.log(Http.responseText)
}
