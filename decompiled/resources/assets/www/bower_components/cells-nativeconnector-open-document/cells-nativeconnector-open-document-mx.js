/*eslint new-cap: 0*/
class CellsNativeconnectorOpenDocumentMx extends CellsBehaviors.CellsNativeconnectorOpenDocumentMixin(Polymer.Element) {

  static get is() {
    return 'cells-nativeconnector-open-document-mx';
  }

  static get properties() {
    return {
      /**
       * OTP Id of the request
       */
      otpId: {
        type: String,
        value: 'openDocument'
      },
      /**
       * Params after signature request is send
       */
      signPendingParams: {
        type: Object
      },
      /**
       * Pending service after signature request is send
       */
      signPendingService: {
        type: Object
      },
      /**
       * Represents the AuthenticationState from Headers
       */
      state: {
        type: String,
        value: ''
      }
    };
  }

  /**
   * Opens a file based on its url
   * @param {Object} params
   * @param {String} params.value Url of the requested file to open (mandatory)
   * @param {String} params.mimeType MimeType for the file (mandatory)
   */
  openByUrl(params) {
    return this._genericCallWithSignature(this.pluginName, 'openbyurl', 'open-document-open-by-url-success', params);
  }

  /**
   * Generates new service call with signature headers
   * @param {Object} otp
   */
  signRequest(otp) {
    const data = this._getSignatureData(
      otp.signatureType,
      this.signPendingService.headers.authenticationtype,
      this.signPendingService.headers.authenticationdata
    );
    this.signPendingParams.headers = Object.assign(this.signPendingParams.headers, {
      AuthenticationData: `${data}=${otp.signatureValue}`,
      AuthenticationType: otp.signatureType
    });
    if (this.state) {
      this.signPendingParams.headers.AuthenticationState = this.state;
    }
    this.openByUrl(this.signPendingParams);
  }

  /**
   * Reset signing information
   */
  signReset() {
    this._reset();
  }

  /**
   * Reset signing information on cancel
   */
  signCancel() {
    this._reset();
  }

  _getSignatureData(selectedType, type, data) {
    const typeIndex = type.split(';').findIndex(el => el === selectedType);
    return data ? data.split(';')[typeIndex] : '';
  }

  _genericCallWithSignature(pluginName, methodName, eventName, params) {
    return new Promise((resolve, reject) => {
      if (window.CellsNativePlugins && window.CellsNativePlugins.pluginManager && window.CellsNativePlugins.pluginManager.execute) {
        window.CellsNativePlugins.pluginManager.execute(
          response => {
            this.__fire(eventName, response);
            resolve(response);
          },
          response => {
            response.headers = this._parseHeaders(response.headers) || {};
            const signatureType = response.headers.authenticationtype;
            const signatureData = response.headers.authenticationdata;
            this.state = response.headers?.authenticationstate ?? '';
            if (signatureType && signatureData) {
              this.set('signPendingParams', JSON.parse(JSON.stringify(params)));
              this.set('signPendingService', response);
              this._dispatchSignatureRequired(response);
            } else {
              this.__fire('error', response);
              this.__fire(eventName.replace('success', 'error'), response);
            }
            reject(response);
          },
          pluginName, methodName, params);
      } else {
        var errorMessage = 'Plugin is not present (not installed).';
        var errorObject = {resultCode: -2, params: errorMessage};
        console.warn(errorMessage);
        this.__fire('error', errorObject);
        reject(errorMessage);
      }
    });
  }

  _dispatchSignatureRequired(response) {
    const data = {
      otpId: this.otpId,
      type: response.headers.authenticationtype,
      data: response.headers.authenticationdata,
      metadata: response
    };
    if (response.headers?.authenticationchallenge) {
      data.challenge = response.headers.authenticationchallenge;
    }
    this.dispatchEvent(new CustomEvent('signature-required-dm', {
      bubbles: false,
      composed: true,
      detail: data
    }));
  }

  _parseHeaders(headers) {
    return typeof headers === 'string' ? JSON.parse(headers) : headers;
  }

  _reset() {
    this.set('signPendingParams', null);
    this.set('signPendingService', null);
  }
}

customElements.define(CellsNativeconnectorOpenDocumentMx.is, CellsNativeconnectorOpenDocumentMx);