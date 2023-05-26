'use strict';

var utils = require('../utils/writer.js');
var SessionEndpoints = require('../service/SessionEndpointsService');

module.exports.sessionLogin = function sessionLogin (req, res, next) {
  SessionEndpoints.sessionLogin()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.sessionLogout = function sessionLogout (req, res, next) {
  SessionEndpoints.sessionLogout()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.sessionLogoutEverywhere = function sessionLogoutEverywhere (req, res, next) {
  SessionEndpoints.sessionLogoutEverywhere()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
