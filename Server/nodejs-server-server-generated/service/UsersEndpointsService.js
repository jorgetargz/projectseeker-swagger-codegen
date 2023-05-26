'use strict';


/**
 * Add device for notifications
 *
 * body AddDeviceDTO 
 * no response value expected for this operation
 **/
exports.addOrUpdateDeviceFCMToken = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Change user role
 *
 * body ChangeUserRoleDTO 
 * returns ProfileDTO
 **/
exports.changeRole = function(body) {
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


/**
 * Create user
 *
 * body CreateUserDTO 
 * returns ProfileDTO
 **/
exports.createUser = function(body) {
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


/**
 * Delete user
 *
 * no response value expected for this operation
 **/
exports.deleteUser = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get my profile
 *
 * returns ProfileDTO
 **/
exports.getMyProfile = function() {
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


/**
 * Get profile
 *
 * id String 
 * returns ProfileDTO
 **/
exports.getProfile = function(id) {
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


/**
 * Modify client profile
 *
 * body ModifyClientProfileDTO 
 * returns ProfileDTO
 **/
exports.modifyClientProfile = function(body) {
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


/**
 * Modify freelancer profile
 *
 * body ModifyFreelancerProfileDTO 
 * returns ProfileDTO
 **/
exports.modifyFreelancerProfile = function(body) {
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

