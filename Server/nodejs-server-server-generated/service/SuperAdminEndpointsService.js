'use strict';


/**
 * Disable user
 *
 * email String 
 * no response value expected for this operation
 **/
exports.disableUser = function(email) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Enable user
 *
 * email String 
 * no response value expected for this operation
 **/
exports.enableUser = function(email) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get user by email
 *
 * email String 
 * returns ProfileDTO
 **/
exports.getUserByEmail = function(email) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "skills" : [ "skills", "skills" ],
  "firebaseId" : "firebaseId",
  "phone" : "phone",
  "name" : "name",
  "rating" : 0.8008281904610115,
  "description" : "description",
  "id" : "id",
  "availability" : "availability",
  "title" : "title",
  "email" : "email",
  "activeRole" : "activeRole"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

