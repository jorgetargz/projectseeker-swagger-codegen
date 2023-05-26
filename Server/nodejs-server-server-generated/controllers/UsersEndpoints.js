'use strict';

var utils = require('../utils/writer.js');
var UsersEndpoints = require('../service/UsersEndpointsService');

module.exports.addOrUpdateDeviceFCMToken = function addOrUpdateDeviceFCMToken (req, res, next, body) {
  UsersEndpoints.addOrUpdateDeviceFCMToken(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.changeRole = function changeRole (req, res, next, body) {
  UsersEndpoints.changeRole(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createUser = function createUser (req, res, next, body) {
  UsersEndpoints.createUser(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteUser = function deleteUser (req, res, next) {
  UsersEndpoints.deleteUser()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getMyProfile = function getMyProfile (req, res, next) {
  UsersEndpoints.getMyProfile()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProfile = function getProfile (req, res, next, id) {
  UsersEndpoints.getProfile(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modifyClientProfile = function modifyClientProfile (req, res, next, body) {
  UsersEndpoints.modifyClientProfile(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modifyFreelancerProfile = function modifyFreelancerProfile (req, res, next, body) {
  UsersEndpoints.modifyFreelancerProfile(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
