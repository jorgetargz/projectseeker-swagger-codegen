'use strict';

var utils = require('../utils/writer.js');
var SuperAdminEndpoints = require('../service/SuperAdminEndpointsService');

module.exports.disableUser = function disableUser (req, res, next, email) {
  SuperAdminEndpoints.disableUser(email)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.enableUser = function enableUser (req, res, next, email) {
  SuperAdminEndpoints.enableUser(email)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getUserByEmail = function getUserByEmail (req, res, next, email) {
  SuperAdminEndpoints.getUserByEmail(email)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
