/*eslint new-cap: 0*/
/*global BGADPCustomersV0*/
window.CellsBehaviors = window.CellsBehaviors || {};

window.CellsBehaviors.deviceAccessesControllerMixin = superClass =>
  class extends superClass {

    static get properties() {
      return {
        /**
         * array with pages excluded when not execute _backFromSettings returning from settings
         */
        pagesWithoutBackstep: {
          type: Array,
          value: () => ([
            'device-accesses-allInOneSTEnrollment',
            'device-accesses-stEnrollment',
            'stEnrollment',
            'securitySettingsDeviceAccessController'
          ])
        },
        /**
         * Device accesses modal text
         */
        deviceAccessesSemiModalConfig: {
          type: Object,
          value: {
            code: 'DEVICE-ACCESSES-HALF-MODAL',
            acceptBtLabel: 'glomo-device-accesses-activate-later-biometrics-false-label',
            text: 'glomo-device-accesses-activate-later-biometrics-false',
            event: 'device-accesses-activate-later'
          }
        },
        /**
         * DVS alternative modal text
         */
        dvsAlternativeSemiModalConfig: {
          type: Object,
          value: {
            code: 'DVS-ALTERNATIVE-VERIFICATION',
            acceptBtLabel: 'dvs-signing-verification-alternative-verification-accept-button',
            cancelBtLabel: 'dvs-signing-verification-alternative-verification-cancel-button',
            text: 'dvs-signing-verification-alternative-verification',
            event: 'make-alternative-create-verification'
          }
        }

      };
    }

    static get observers() {
      return [
        '_friendlyFraudChanged(friendlyFraud.value)',
        '_changePermissionsStatus(visibilityChange)'
      ];
    }

    /**
     * friendlyFraud property observer
     */
    _friendlyFraudChanged(friendlyFraudValue) {
      if (friendlyFraudValue) {
        this._setFlag('isFriendlyFraud', true);
        this._saveDeviceAccesses();
      }
    }

    /**
     * visibilityChange property observer
     */
    _changePermissionsStatus(visibilityChange) {
      visibilityChange.listener = this._configSettingsListener.bind(this);
      document.addEventListener('visibilitychange', visibilityChange.listener);
    }
    /**
     * Updates tsec
     * @param {String} tokenInfo
     */
    _observeTsec(tokenInfo) {
      if (tokenInfo && tokenInfo.type === 'tsec' && tokenInfo.token) {
        this.tsec = tokenInfo.token;
      }
    }

    _replaceChars(str) {
      return str.normalize('NFD').replace(/[\u0300-\u036f\u0311\u0334]/g, '');
    }

    _encodeProp(str, path) {
      const setToValue = (obj, value, objPath) => {
        var i;
        objPath = objPath.split('.');
        for (i = 0; i < objPath.length - 1; i++) {
          obj = obj[objPath[i]];
        }
        obj[objPath[i]] = value;
      };
      let streamParsed = JSON.parse(str);
      let prop = this.get(path, streamParsed);
      if (prop) {
        setToValue(streamParsed, encodeURI(prop), path);
      }
      return JSON.stringify(streamParsed);
    }

    _completefield(field, fillNumber, fillType = '@') {
      while (field.length < fillNumber) {
        field = `${field}${fillType}`;
      }

      return field;
    }

    /**
     * Method to check if it has enrolled SF
     * @param {String} signMethod
     */
    _hasEnrolledST(signMethod) {
      return new Promise(resolve => {
        if (signMethod.includes('SOFT_TOKEN')) {
          this.signMethod = 'otp-token';
          this._setFlag('mandatoryST', false);
          this._existSoftTokenEnrollment().then(() => {
            resolve();
          }, () => {
            this._setFlag('offerST', true);
            resolve();
          });
        } else {
          this._setFlag('offerST', false);
          if (signMethod.includes('SMS')) {
            this.signMethod = 'otp-sms';
            this._setFlag('offerST', true);
            this._setFlag('showST', true);
            this._setFlag('showAll', true);
            this._setFlag('enrolledST', false);
            this._setFlag('mandatoryST', true);
          }
          this._deleteOldSoftToken().then(() => resolve(), () => resolve());
        }
      });
    }

    /**
     *
     * Exist Softtoken Enrolled
     */
    _existSoftTokenEnrollment() {
      return new Promise((resolve, reject) => {
        this._getAllSoftToken()
          .then(tokens => {
            if (tokens.array.length) {
              this._setFlag('enrolledST', true);
              this._setFlag('offerST', false);
              this._setFlag('showST', false);
              resolve();
            } else {
              this._setFlag('enrolledST', false);
              this._setFlag('offerST', true);
              this._setFlag('showST', true);
              reject();
            }
          })
          .catch(() => reject());
      });
    }

    /**
     *
     * Remove all obsolete Softtoken ("TOTP")
     */
    _deleteOldSoftToken() {
      return this._getAllSoftToken()
        .then(tokens => {
          if (tokens.array.length) {
            tokens.array.forEach(token => this.$.pluginSofttoken.deleteToken(token.serial));
          }
        });
    }

    /**
     *
     * Recover all Softtoken ("TOTP")
     */
    _getAllSoftToken() {
      return this.$.pluginSofttoken.getTokenList('TOTP').then(tokens => tokens);
    }

    /**
     * Method to check if it has enrolled FIDO
     */
    _hasEnrolledFIDO() {
      if (!this._getFlag('enrolledFIDO') && !this._getFlag('activedLater')) {
        return new Promise(resolve => {
          this._checkRegistrationPossible()
            .then(() => {
              this._checkBioCapabilities().then(() => resolve(), () => resolve());
            }, () => resolve());
        });
      }
    }

    /**
     * check FIDO Compliance
     */
    _checkRegistrationPossible() {
      return this.$.pluginFido.register(this.customerId, 'check')
        .then(response => {
          if (response.regIsPossible === 'true' || response.regIsPossible) {
            this._setFlag('offerFIDO', true);
          }
        });
    }

    /**
     *
     * Method to fire event when enabled Push Notifications in Notifications flow
     */
    showNotificationsMessage() {
      this._getStorage('showEnabledPush', 'session').then(active => {
        /* istanbul ignore else */
        if (active) {
          window.sessionStorage.removeItem('showEnabledPush');
          this._fireEvent('notifications-bottom-modal-message-success', 'notifications-bottom-modal-message-success');
        }
      });
    }

    _checkFlagsIsFriendlyFraud() {
      return this._getFlag('isFriendlyFraud');
    }

    _checkFlagsStEnrollment() {
      return this._getFlag('offerST') && !this._getFlag('offerFIDO') && this._getFlag('showST');
    }

    _checkFlagsAllInOneSTEnrollment() {
      return this._getFlag('offerST') && this._getFlag('offerFIDO') && this._getFlag('showAll');
    }

    _checkFlagsFidoEnrollment() {
      return !this._getFlag('offerST') && this._getFlag('offerFIDO') && this._getFlag('showFIDO');
    }

    _checkFlagsWearables() {
      return this._getFlag('offerWearables') && this._getFlag('showWearables');
    }

    _showFlowOnlyOnce() {
      if (!this._getFlag('mandatoryST')) {
        this._setFlag('showAll', false);
        this._setFlag('showST', false);
      }
    }

    /**
     * Update variables in controller before navigation to page
     */
    configPage(config) {
      this.deviceAccesses = config.deviceAccesses;
      this.activePage = config.activePage;
      this.signMethod = config.signMethod;
      this.streamFingerprint = config.streamFingerprint;
      this.userId = config.userId;
      this.deviceId = config.deviceId;
    }

    /**
     * visibility change handler
     */
    _configSettingsListener(e) {
      if (document.visibilityState === 'visible') {
        document.removeEventListener('visibilitychange', this.visibilityChange.listener);
        if (!this.pagesWithoutBackstep.includes(this.otpId)) {
          this._backFromSettings();
        }
      }
    }

    /**
     * Metodo que se llama cuando vamos a AJUSTES desde FIDO Configuration
     */
    deviceConfigurationSettings() {
      this.visibilityChange.listener = this._configSettingsListener.bind(this);
      document.addEventListener('visibilitychange', this.visibilityChange.listener);
      this._setFlag('showFIDOCard', true);
      this._saveDeviceAccesses();
      this._fireEvent('navigate-to-open-configuration-settings');
    }

    /**
     * Method that is called when we started the ST enrolled
     * Make the first request to enroll ST
     * We need the "deviceId", "streamFingerprint" and "userId"
     */
    requestFirstStepSTEnrollment() {
      if (this.deviceId && this.streamFingerprint && this.userId) {
        this._fireEvent('open-control-veil');
        this._makePostSoftwareTokens();
        this.closeControlVeil();
      } else {
        this._fireEvent('open-control-veil');
        this._showModalError();
      }
    }

    /**
     * Fire Event to Show "global-alert-manager" modal component
     * with Standard Error configuration.
     * type: 'generic' || 'service'
     */
    _showModalError({
      type = 'generic',
      errorMessage = 'alert-DEVICE-ACCESSES-GENERIC-ERROR-message',
      fullModal = false,
      srcImage = 'images/errors/micro-error.svg',
      event: evt = '',
      config
    } = {}) {
      this._fireEvent(evt || `glomo-device-accesses-${type}-error`);
      this._fireEvent('glomo-device-accesses-show-modal', config || {
        code: `DEVICE-ACCESSES-${type.toUpperCase()}-ERROR`,
        selectedConfig: {
          className: fullModal ? 'full-height-error' : 'error',
          heroImage: fullModal ? Polymer.ResolveUrl.resolveUrl(srcImage) : '',
          openMaximized: fullModal,
          iconOnlyFullHeight: true,
          title: 'glomo-standard-error-handler-title',
          acceptBtLabel: `alert-DEVICE-ACCESSES-${type.toUpperCase()}-ERROR-accept`,
          template: {
            type: 'paragraphs',
            values: [{
              icon: fullModal ? '' : 'coronita:alert'
            },
            {
              title: 'glomo-standard-error-handler-title'
            },
            {
              text: this.deviceAccesses.settingsFlow ? 'alert-SETTINGS-GENERIC-ERROR-message' : errorMessage
            }
            ]
          }
        }
      });
    }

    _makePostSoftwareTokens() {
      this.$.dpSecurity.postSoftwareTokens({
        'deviceIdentifier': this.deviceId
      }, {
        'BCS-Device-Id': this._generatePlusTiStream()
      });
    }

    /**
     * Second step OTP sign
     * @param {String} sign
     */
    signTypeRequest(sign) {
      this.$.dpSecurity.signTypeRequest(sign);
    }

    /**
     * To generate a new OTP SMS
     * @param {String} sign
     */
    signGetNewOtp(sign) {
      this._makePostSoftwareTokens();
    }

    /**
     * Por este Metodo llega de nativo la orden de sacar la OTP cuando
     * hacemos el enrollment de FIDO.
     * En el payload me llega un array con los metodos de firma disponibles
     */
    signRequestFirstStepFido(payload) {
      let authenticationType = payload.type;
      if (!(['33', '36', '131', '132'].some(i => authenticationType.includes(i)))) {
        this._handleFidoError();
      }
      if (this.activePage === 'allInOneFidoEnrollment') {
        this.$.pluginSofttoken.getTokenList('TOTP')
          .then(tokens => {
            const refToken = tokens.array[0].serial;
            const type = tokens.array[0].type;
            return this.$.pluginSofttoken.genOtp(refToken, null, null, type);
          })
          .then(res => this._fireEvent('device-accesses-sign-fido-enrollment', {
            AuthenticationData: `otp-token=${res.otp}`,
            AuthenticationType: '33',
            'BCS-Device-Id': this._generatePlusTiStream(),
            'Content-Type': 'application/json'
          }))
          .catch(err => {
            this._handleFidoError();
          });
      } else if (this.activePage.startsWith('fidoEnrollment')) {
        this.closeControlVeil();
        this._fireEvent('signature-required-first-step-dm', {
          type: payload.type.join(';'),
          otpId: this.otpId
        });
      }
    }

    navigateToBackStep(e) {
      /* istanbul ignore else */
      if (e === this.activePage) {
        this._setFlag('settingsFlow', false);
        this._saveDeviceAccesses();
        this._fireEvent('glomo-device-accesses-backstep-navigation');
      }
    }

    navigateToBackStepFromChannel() {
      /* istanbul ignore else */
      if (!this._getFlag('settingsFlow')) {
        this._fireEvent('glomo-device-accesses-backstep-navigation');
      }
    }

    showTermsAndConditions() {
      this._fireEvent('open-control-veil');
      this._fireEvent('glomo-device-accesses-show-tc', this.termsAndConditionsId);
    }

    showTermsAndConditionsResult(e) {
      this.closeControlVeil();
      /* istanbul ignore else */
      if (!e.success) {
        this._fireEvent('glomo-device-accesses-show-modal', {
          code: 'DEVICE-ACCESSES-PDF-ERROR',
          primaryButtonClass: 'primary',
          selectedConfig: {
            className: 'info',
            openMaximized: false,
            iconOnlyFullHeight: true,
            template: {
              type: 'paragraphs',
              values: [{
                icon: 'coronita:info'
              },
              {
                text: 'alert-GENERAL-ERROR-message-subtext'
              }
              ]
            }
          }
        });
      }
    }

    /**
     * Parse Error Event
     */
    _parseError(error) {
      let errorMessage;
      let errorCode;
      let httpStatus;
      let fullModal;
      let maxChars = 255;

      if (error && error.detail) {
        //Error de Servicios
        errorMessage = error.detail['error-message'] || '';
        errorCode = error.detail['error-code'] || '';
        httpStatus = error.detail['http-status'] || 0;
      } else {
        //Error de Plugins
        errorMessage = (error || {}).message || '';
        errorCode = (error || {}).code || '';
      }

      fullModal = errorMessage.length >= maxChars;

      return {
        errorMessage,
        errorCode,
        httpStatus,
        fullModal
      };
    }

    _showGenericError() {
      this._fireEvent('glomo-device-accesses-show-modal', {
        code: 'DEVICE-ACCESSES-GENERIC-ERROR',
        selectedConfig: {
          iconOnlyFullHeight: true,
          acceptBtLabel: 'alert-DEVICE-ACCESSES-GENERIC-ERROR-accept',
          template: {
            type: 'paragraphs',
            values: [{
              icon: 'coronita:alert'
            },
            {
              text: 'alert-DEVICE-ACCESSES-GENERIC-ERROR-message'
            }
            ]
          }
        }
      });
    }

    /**
     * Handle Error Fido Flow
     */
    _handleFidoError(secSettingsError = {}) {

      this.closeControlVeil();
      this._showModalError(secSettingsError);
      /* istanbul ignore else */
      if (this._getFlag('settingsFlow')) {
        this.navigateToBackStep(this.activePage); //fidoConfiguration + fidoEnrollment from settings.
        this._fireEvent('security-settings-fido-error'); //FidoEnrollment from settings
      }
    }

    _storeSecondaryClick(deviceAccesses) {
      /* istanbul ignore else */
      if (deviceAccesses) {
        this.deviceAccesses = deviceAccesses;
      }
      this.deviceAccesses.activedLater = true;
      this._updateLocalStorage(this.localStorageDeviceAccessesKey, this.deviceAccesses);
    }

    changeCheckbox(e) {
      this._fireEvent('glomo-device-accesses-checkbox-toggle', this._configConfirmButtons(e));
    }

    _setNotSignMethodDetected() {
      this._setFlag('signMethod', false);
      this._saveDeviceAccesses();
      this._sendCard('phoneCard');
      this.closeControlVeil();
      this._fireEvent('cells-template-remove-class-list', {
        method: 'remove',
        value: [ 'template-animation-is-animating' ]
      });
      this._fireEvent('glomo-device-accesses-navigation-dashboard');
    }

    /**
     * Load storage data
     *
     * @event get-native-local-storage
     */
    _getLocalStorage(key, fnName, params) {
      this._requests[key].push({
        fnName,
        params
      });
      this._fireEvent('get-native-local-storage', {
        key
      });
    }

    /**
     * Save data to storage
     *
     * @param {object} data
     * @event set-native-local-storage
     */
    _setLocalStorage(actualData, ob) {
      const { key, data } = ob;

      this._storage[key] = Object.assign(actualData || {}, data);
      this._fireEvent('set-native-local-storage', {
        key,
        value: this._storage[key]
      });
    }

    /**
     * Fires the event to set data for {propertyKey} to native channel.
     * get storage data to correcty sync data and save to storage
     *
     * @param {String} key
     * @param {Object} data
     */
    _updateLocalStorage(key, data) {
      this._getLocalStorage(key, '_setLocalStorage', { key, data });
    }

    /**
     * Response to storage data load with 'localStorageKey'
     *
     * @param {Object} response
     */
    storageDeviceAccessesLoaded(response) {
      this._storageLoaded(this.localStorageDeviceAccessesKey, response);
    }

    async _setDeviceAccessesKeys(keyPaths) {
      let deviceAccessesObj = await this._getDeviceAccessesFlags();
      deviceAccessesObj = this._setNestedKeys(deviceAccessesObj, keyPaths);
      await this._setDeviceAccessesFlags(deviceAccessesObj);
    }


    /**
     * Response to storage data load
     *
     * @param {String} key storage key name
     * @param {Object} response storage actual data
     */
    _storageLoaded(key, response) {
      const STORAGE_KEY_NOT_FOUND = 999;
      const storage = response.code === STORAGE_KEY_NOT_FOUND ? {} : response;
      const loaded = this._requests[key];
      this._requests[key] = [];

      loaded.forEach((request) => {
        this[request.fnName](storage, request.params);
      });
    }

    _getStorage(key = 'deviceAccesses', type = 'local') {
      return Promise.resolve(JSON.parse(window[`${type}Storage`].getItem(key)));
    }

    _setStorage(key = 'deviceAccesses', value = true, type = 'local') {
      return Promise.resolve(window[`${type}Storage`].setItem(key, JSON.stringify(value)));
    }

    navigateToDashboard() {
      this._fireEvent('glomo-device-accesses-navigation-dashboard');
    }

    navigateToAtmLocator() {
      this._fireEvent('glomo-device-accessss-click-phoneModal');
    }

    /**
     * Sets customerId with native channel
     * @param {Object}
     */
    deeplinkSetCustomerId(params) {
      this.customerId = params?.id;
    }

    _navigateToWereables() {
      this._setFlag('showWearables', false);
      this._saveDeviceAccesses();
      this._fireEvent('glomo-device-accesses-wearables-selected');
    }

    _enableWearables() {
      this._setFlag('offerWearables', true);
      return Promise.resolve();
    }


    _setFlag(flag, value) {
      this.deviceAccesses[flag] = value;
    }

    _getFlag(flag) {
      return this.deviceAccesses[flag];
    }

    _sendCard(cardId, error = '') {
      this._fireEvent('glomo-device-accesses-config-card', {
        cardId,
        error
      });
    }

    _fireEvent(eventName, detail) {
      this.dispatchEvent(new CustomEvent(eventName, {
        bubbles: true,
        composed: true,
        detail: detail
      }));
    }

    restartWearables() {
      this._setFlag('showWearables', true);
      this._saveDeviceAccesses();
    }

    signReset() {
      this._fireEvent(`glomo-device-accesses-${this.activePage}-sign-modal-close`);
    }

    signCancel() {
      this._fireEvent(`glomo-device-accesses-cancel-${this.activePage}-request`);
      this._set_fidoCancelled(true);
    }

    _getPermissions(dataPermission, permissionsMobile, namePermission) {
      if (namePermission === 'photo-library') {
        namePermission = 'read-storage';
      }
      permissionsMobile.push({
        name: namePermission.split('-').length > 1 ? namePermission.split('-')[1] : namePermission,
        granted: dataPermission === 'granted' ? true : false,
      });
      this._fireEvent('on-permissions-data-ready', permissionsMobile);
      return permissionsMobile;
    }

    /**
     Return the state of mobile permission from mobile plugin
     */
    getPermissionsMobile() {
      let permissions = [];
      if (this.permissionsMobile) {
        this._fireEvent('open-control-veil');
        for (var i = 0; i < this.permissionsMobile.length; ++i) {
          let namePermission = this.permissionsMobile[i];
          this.$.pluginMobilePermissions.checkState(this.permissionsMobile[i]).then(data => {
            this._getPermissions(data.state, permissions, namePermission);
          });
        }
        this.closeControlVeil();
      }
    }

    /**
     * Method that returns modal config object
     * @event
     */
    _showSemiModal(modalConfig) {
      const config = {
        code: modalConfig.code,
        selectedConfig: {
          className: 'info',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: modalConfig.acceptBtLabel,
          ...modalConfig.cancelBtLabel && {cancelBtLabel: modalConfig.cancelBtLabel},
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:info', iconClass: 'icon-size-24', class: 'info' },
              { text: modalConfig.text }
            ]
          }
        }
      };
      this._fireEvent(modalConfig.event, config);
    }

    /**
     * Method to show semi modal in deviceAccesses
     */
    showModalAccessSign() {
      this._showSemiModal(this.deviceAccessesSemiModalConfig);
    }

    /**
     * Method for opening generic error modal
     * @params {Object} error
     * @event generic-error
     * @event close-control-veil
     */
    genericErrorModal(error) {
      this._fireEvent('generic-error', error);
      this._fireEvent('close-control-veil');
    }

    /**
     * Method for trigger event when accepting modal from device accesses
     * @event device-accesses-accept-later-modal
     */
    goToNextFlowDeviceAccesses() {
      this.goToNextFlow();
      this._fireEvent('device-accesses-accept-later-modal');
    }

    /**
     * Close control veil
     */
    closeControlVeil() {
      this._fireEvent('close-control-veil');
    }
  };
